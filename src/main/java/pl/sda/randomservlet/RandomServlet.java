package pl.sda.randomservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "RandomServlet", urlPatterns = "/RandomServlet")
public class RandomServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            numbers[i] = random.nextInt(250)+51;
        }

        PrintWriter writer = response.getWriter();
        writer.println("<html>\n<body>");
        writer.println("<ul>");
        for(int number : numbers){
            writer.println("<li>"+number+"</li>");
        }
        writer.println("</ul>");
        writer.println("</html>\n</body>");
    }
}
