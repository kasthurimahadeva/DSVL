package com.dsvl.flood;

import java.text.MessageFormat;

public class UdpMsgBuilder {

    /**
     * length SER IP port file_name hops
     */
    private static final String SEARCH_MSG_TEMPLATE = "{0} SER {1} {2,number,#} {3} {4}";

    /**
     * length REG IP_address port_no username
     */
    private static final String REGISTER_MSG_TEMPLATE = "{0} REG {1} {2,number,#} {3}";

    /**
     * Returns a {@code String} of the format {@code length SER IP port file_name hops}
     *
     * @param nodeAddress
     * @param nodeTcpPort
     * @param fileName
     * @param hops
     * @return the search message
     */
    public static String buildSearchMsg(String nodeAddress, Integer nodeTcpPort, String fileName, Integer hops) {
        /*
         * 4 - length
         * 5 - spaces
         * 3 - SER
         * __
         * 12
         * */
        int length = 12 + nodeAddress.length() + nodeTcpPort.toString().length() + fileName.length() + hops.toString().length();

        return MessageFormat.format(SEARCH_MSG_TEMPLATE, String.format("%04d", length), nodeAddress, nodeTcpPort, fileName, hops);
    }

    /**
     * Returns a {@code String} of the format {@code length REG IP_address port_no username}
     * @param nodeAddress
     * @param nodeUdpPort
     * @param username
     * @return the register message
     */
    public static String buildRegisterMsg(String nodeAddress, Integer nodeUdpPort, String username) {
        /*
         * 4 - length
         * 4 - spaces
         * 3 - REG
         * __
         * 11
         * */
        int length = 11 + nodeAddress.length() + nodeUdpPort.toString().length() + username.length();

        return MessageFormat.format(REGISTER_MSG_TEMPLATE, String.format("%04d", length), nodeAddress, nodeUdpPort, username);
    }

}
