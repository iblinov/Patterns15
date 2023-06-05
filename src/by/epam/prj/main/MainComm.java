package by.epam.prj.main;

import by.epam.prj.content.RequestContent;
import by.epam.prj.invoker.ServiceInvoker;

import java.util.HashMap;

/**
 * Created by Ihar_Blinou on 7/11/2017.
 */
public class MainComm {
    public static void main(String[] args) {
        RequestContent content = new RequestContent();
        HashMap<String, String> param = new HashMap<>();
        param.put("command","Sign_Out");
        content.setRequestParameters(param);
        ServiceInvoker invoker = new ServiceInvoker(); // servlet
        invoker.invoke(content);
    }
}
