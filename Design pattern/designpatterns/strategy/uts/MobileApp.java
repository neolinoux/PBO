package designpatterns.strategy.uts;


/**
 *
 * @author user
 */
public class MobileApp {
    public static void main(String[] args) throws Exception {
        Content content = null;
        String contentType = "infographic";
        String format = "pdf";
        String shareTo = "email";
        ShareStrategy shareStrategy = null;
        if(shareTo.equalsIgnoreCase("email")){
            shareStrategy = new Email();
        }else if(shareTo.equalsIgnoreCase("chatApp")){
            shareStrategy = new ChatApp();
        }else if(shareTo.equalsIgnoreCase("socialMedia")){
            shareStrategy = new SocialMedia();
        }
            
        if(contentType.equalsIgnoreCase("publication")){
            content = new Publication();
            content.display();
            content.selectContent();
            if(!format.equalsIgnoreCase("pdf")){
                throw new Exception("Format tidak sesuai.");
            }
            content.generateShareContent();
            content.setShareStrategy(shareStrategy);
            content.share();
        }else if(contentType.equalsIgnoreCase("table")){
            content = new TableData();
            content.display();
            content.selectContent();
            if(format.equalsIgnoreCase("pdf")){
                content.setGenerateContentStrategy(new GeneratePDF());
            }else if(format.equalsIgnoreCase("csv")){
                content.setGenerateContentStrategy(new GenerateCSV());
            }else if(format.equalsIgnoreCase("image")){
                content.setGenerateContentStrategy(new GenerateImage());
            }else{
                throw new Exception("Format file yg tidak sesuai");
            }
            content.generateShareContent();
            content.setShareStrategy(shareStrategy);
            content.share();
        }else if(contentType.equalsIgnoreCase("infographic")){
            content = new Infographic();
            content.display();
            content.selectContent();
            if(format.equalsIgnoreCase("pdf")){
                content.setGenerateContentStrategy(new GeneratePDF());
            }else if(format.equalsIgnoreCase("image")){
                content.setGenerateContentStrategy(new GenerateImage());
            }else{
                throw new Exception("Format file yg tidak sesuai");
            }
            content.generateShareContent();
            content.setShareStrategy(shareStrategy);
            content.share();
        }
    }
}
