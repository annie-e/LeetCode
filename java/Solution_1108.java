public class Solution_1108 {
	
	/**
	 * 1108. Defanging an IP Address
	 * @param address
	 * @return defanged IP address
	 */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    
    public String defangIPaddrIterate(String address) {
    	
    	String defangedIP = "";
    	
    	for(int i = 0; i < address.length(); i++) {
    		if(address.charAt(i) == '.') {
    			defangedIP += "[.]";
    		} else {
    			defangedIP += address.charAt(i);
    		}
    	}
    	
    	return defangedIP;
    }
	
}
