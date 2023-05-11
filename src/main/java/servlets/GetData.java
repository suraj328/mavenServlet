package servlets;
import model.StoreData;
//note import servlet jar file dependency in pom.xml file
//chaeck maven -> dependency either there is servlrt jar api is available or not
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.*;


//points to remeber
//every servlet class must have extends HttpServlet to use servlet features
public class GetData extends HttpServlet {
    
    //doGet method handle all the get request
    //HttpServletRequest recive get upcoming  data from browsers
    //httpServletResponse use to response back to http like sending headers 

    protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServerException,IOException
    {
        int id =  Integer.parseInt(request.getParameter("id"));
        CreateData cd =  new CreateData();
        StoreData  sd =  cd.getStoreData(id);

        //two method to call page from controller or servlet
        // dispatcher and redirect

        //request
        //sending data to client
        // request.setAttribute("data", sd);

        /*RequestDispatcher rd =  request.getRequestDispatcher("DisplayData.jsp") ;
        try {
            rd.forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // Redirect
        HttpSession session = request.getSession();
        session.setAttribute("data", sd);
        response.sendRedirect("DisplayData.jsp");
    }
}
