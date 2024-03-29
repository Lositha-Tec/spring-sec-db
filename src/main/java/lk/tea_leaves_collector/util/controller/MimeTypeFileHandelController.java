package lk.tea_leaves_collector.util.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletContext;

@Controller
public class MimeTypeFileHandelController {
    private static final Logger logger = LoggerFactory.getLogger(MimeTypeFileHandelController.class);
    private final ServletContext context;

    @Autowired
    public MimeTypeFileHandelController(ServletContext context) {
        this.context = context;
    }
/*
    @GetMapping(value = "/getFile/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public void fileDownload(@PathVariable("id") int id, HttpServletResponse response, HttpServletRequest request) {


        String fullPath = request.getServletContext().getRealPath("/resources/report/" + id + ".pdf");
        File file = new File(fullPath);
        final int BUFFER_SIZE = 4096;

        if (file.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(file);

                String mimeType = context.getMimeType(fullPath);

                response.setContentType(mimeType);

                response.setHeader("content-disposition: inline;", "filename=" + id + ".pdf");

                OutputStream outputStream = response.getOutputStream();

                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                outputStream.close();
                inputStream.close();
                response.setStatus(200);
                //response.sendRedirect("/home");
                file.delete();

            } catch (Exception e) {
                logger.error("file handler ++" + e.toString());
            }
        }
    }

    @GetMapping("/imageDisplay")
    public void showImage(@RequestParam("id") int imageId,HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // Item item = itemService.get(itemId); --> contained class object
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        // response.getOutputStream().write(item.getItemImage()); need to get image where store it

        response.getOutputStream().close();
    }*/

}
