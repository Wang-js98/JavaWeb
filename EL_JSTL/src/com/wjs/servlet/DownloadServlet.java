package com.wjs.servlet;




import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;


@WebServlet(name = "DownloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取要下载的文件名
        String downloadFileName ="b.jpg";
        //2.读取要下载的文件内容(通过servletContext对象可以读取)
        ServletContext servletContext=getServletContext();
        //获取要下载文件的类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println("下载文件的类型"+mimeType);
        //4.在回传前，通过响应头告诉客户端返回的数据类型
        response.setContentType(mimeType);

        //5.还要告诉客户端受到的数据是用于下载使用（还是使用响应头）
        //Content-Disposition响应头，表示收到的数据怎么处理
        //attachment表示下载使用
        //filename表示指定下载的文件名（可以修改）如果里面包含了中文，则要进行Url编码URLEncoder.encode("王俊森","utf-8")
        //url编码是吧汉子转换成%xx%xx的格式
        response.setHeader("Content-Disposition","attachment;filename"+ URLEncoder.encode("王俊森","utf-8"));

        //获取资源像流一样返回
                      //斜杠被服务器解析表示地址为http；//ip：port工程名/   映射到代码的web目录
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
            //获取响应的输出流
        OutputStream outputStream=response.getOutputStream();
             //读取输入流中的全部数据，复制给输出流,输出给客户端
        IOUtils.copy(resourceAsStream,outputStream);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
