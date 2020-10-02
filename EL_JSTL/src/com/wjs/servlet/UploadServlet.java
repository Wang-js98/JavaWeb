package com.wjs.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* System.out.println("文件上传过来了");
        ServletInputStream inputStream=request.getInputStream();
        byte[] buffer=new byte[1024000];
        int read=inputStream.read(buffer);
        System.out.println( new String(buffer,0,read));*/
        //1.先判断上传的数据是否多段数据，只有是多段的数据，才是文件上传的
        if (ServletFileUpload.isMultipartContent(request)){
            //创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory=new DiskFileItemFactory();
            //创建用于解析上传数据的工具类servletFileUpload
            ServletFileUpload servletFileUpload=new ServletFileUpload(fileItemFactory);
            try {
                //调用解析方法解析上传的数据，得到每一个表单项
                List<FileItem> list = servletFileUpload.parseRequest(request);
                for (FileItem fileItem:list){
                    if (fileItem.isFormField()){
                        //普通表单项
                        System.out.println("表单项的name属性值："+fileItem.getFieldName());
                        //参数utf-8解决乱码问题
                        System.out.println("表单项的value属性值："+fileItem.getString("utf-8"));
                    }else {
                        //上传的文件
                        System.out.println("表单项的name属性值："+fileItem.getFieldName());
                        System.out.println("上传的文件名："+fileItem.getName());

                        fileItem.write(new File("D:\\"+fileItem.getName()));
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
