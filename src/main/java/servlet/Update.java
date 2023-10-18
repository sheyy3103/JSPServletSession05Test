package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.CompanyDAOImpl;
import enity.Company;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Update() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String companyId = request.getParameter("companyId");
		String companyName = request.getParameter("companyName");
		String address = request.getParameter("address");
		String director = request.getParameter("director");
		String inaugurationDay = request.getParameter("inaugurationDay");
		String fieldOfActivity = request.getParameter("fieldOfActivity");
		String totalEmployees = request.getParameter("totalEmployees");

		boolean blValid = true;
		if (companyName == null || companyName.length() == 0) {
			request.setAttribute("companyNameErr", "Company name cannot be empty!");
			blValid = false;
		}
		if (address == null || address.length() == 0) {
			request.setAttribute("addressErr", "Address cannot be empty!");
			blValid = false;
		}
		if (director == null || director.length() == 0) {
			request.setAttribute("directorErr", "Director cannot be empty!");
			blValid = false;
		}
		if (inaugurationDay == null || inaugurationDay.length() == 0) {
			request.setAttribute("inaugurationDayErr", "Inauguration day choose your birthday!");
			blValid = false;
		}

		if (fieldOfActivity == null || fieldOfActivity.length() == 0) {
			request.setAttribute("fieldOfActivityErr", "Field of activity cannot be empty!");
			blValid = false;
		}
		if (totalEmployees == null || totalEmployees.length() == 0) {
			request.setAttribute("totalEmployeesErr", "Total employees cannot be input");
			blValid = false;
		}

		if (blValid) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			Date inau = null;
			try {
				inau = sf.parse(inaugurationDay);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int totalOfEmployees = Integer.parseInt(totalEmployees);
			Company c = new Company();
			c.setCompanyId(companyId);
			c.setCompanyName(companyName);
			c.setAddress(address);
			c.setDirector(director);
			c.setInaugurationDay(inau);
			c.setFieldOfActivity(fieldOfActivity);
			c.setTotalEmployees(totalOfEmployees);

			boolean blUpdate = new CompanyDAOImpl().updateCompany(c);
			if (blUpdate)
				request.getRequestDispatcher("ListCompanies").forward(request, response);
			else {
				request.setAttribute("err", "Updated failed!");
				request.setAttribute("c", c);
				request.getRequestDispatcher("edit.jsp").forward(request, response);
			}
		} else
			request.getRequestDispatcher("edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
