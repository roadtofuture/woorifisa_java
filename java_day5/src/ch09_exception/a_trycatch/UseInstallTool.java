package ch09_exception.a_trycatch;

public class UseInstallTool {
    public static void main(String[] args) {
        InstallTool tool = new InstallTool();
        try {
            tool.copy();
            tool.install();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tool.delete();
        }
        System.out.println("설치 종료");
    }
}
