/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olymer
 */
public class Global {
    public static String os = "unknown";
    public static String header1 = "# -*- mode: ruby -*-\n"+
                                 "# vi: set ft=ruby :\n" +
                                 "Vagrant::Config.run do |config|";
    public static String boxtype = "config.vm.box = \"base\"";
    public static String boxurl = "";
    public static String portforwarding = "config.vm.forward_port 80, 5432";
    public static String gui = "# config.vm.boot_mode = :gui";
    public static String ssh = "";
    public static String updateSubmodules = "if `git submodule`[/^-/]\n"
                                            + "    puts \"Initializing and updating the Git submodules (Chef cookbooks and repo)\"\n"
                                            + "    puts `git submodule update --init` ? \"Successfully updated the Git submodules\" : \"Updating Submodules failed. Please try git submodule update --init manually\"\n"
                                            + "end\n";
    public static String footer1 = "end";
    public static String port = "";
    
    /*
     Log will be saved here
     */
    public static String log1  = "";
    public static String log2  = "";
    public static String log3  = "";
    public static String log4  = "";
    public static String log5  = "";
    public static String log6  = "";
    public static String log7  = "";
    public static String log8  = "";
    public static String logh1  = "";
    public static String logh2  = "";
    public static String logh3  = "";
    public static String logh4  = "";
    public static String logh5  = "";
    public static String logh6  = "";
    
    // Directory where Vagrantfile will be created
    public static String directory = "";
    
    
    // History
    
    public static String portHistory = "";
    public static String boxurlHistory = "";
    
    public static boolean preinstallHistoryMysql = false;
    public static boolean preinstallHistorypsql = false;
    public static boolean preinstallHistoryapt = false;
    public static boolean preinstallHistoryapache = false;
    public static boolean preinstallHistoryphp5 = false;
    public static boolean preinstallHistoryopenssl = false;
    
    public static String directoryHistory = "";
    public static boolean guimodeHistory = false;
    public static boolean sshHistory = false;
    
    public static boolean step4empty = false;
    
    // Settings
    
    public static boolean settingPopup = false; // open projectdirectory when setup is finished

}
