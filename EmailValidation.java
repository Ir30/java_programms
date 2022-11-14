
public class EmailValidation {
    static boolean validate(String s){

            String[] part1;
            String userNmae;
            String[] part2;
            String siteName;
            String ext;
        try{
            part1=s.split("@");
            userNmae=part1[0];
            // System.out.println(userNmae);
            // System.out.println(part1[1]);
            part2=part1[1].split("\\.");
            siteName=part2[0];
            // System.out.println(siteName);
            ext=part2[1];
            // System.out.println("ext: "+ext);
            // System.out.println("inside try");
        }
        catch(Exception e){
            // System.out.println("inside catch");
            return false;
        }
        boolean val=true;
        if(userNmae.equals("")){
            return false;
        }
        if(siteName.equals("")){
            return false;
        }
        if(ext.length()>3){
            return false;
        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(validate("ird@gmail.comhj"));
        System.out.println(validate("ird@gmail.com"));
        System.out.println(validate("ird@gmailcomhj"));
        System.out.println(validate("irdgmail.comhj"));
        System.out.println(validate("ird@.comhj"));
        System.out.println(validate("@gmail.comhj"));

    }
}
