package com.google.scm.mango.chaincode.client;

import org.hyperledger.fabric.gateway.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ChainCodeUtil {

    private static Contract chainCodeContract;

    private static void init(){
        EnrollAdmin.enroll();
        RegisterUser.enroll();
    }

    public static Contract getContract() {
        if(null != chainCodeContract){
            return chainCodeContract;
        }
        init();
        // Load a file system based wallet for managing identities.
        Contract contract = null;
        try {
            Path walletPath = Paths.get("wallet");
            Wallet wallet = Wallets.newFileSystemWallet(walletPath);
            // load a CCP
            Path networkConfigPath = Paths.get("..", "test-network", "organizations", "peerOrganizations", "org1.example.com", "connection-org1.yaml");

            Gateway.Builder builder = Gateway.createBuilder();
            builder.identity(wallet, "mangoScmUser").networkConfig(networkConfigPath).discovery(true);


            // create a gateway connection
            Gateway gateway = builder.connect();
            // get the network and contract
            Network network = gateway.getNetwork("mychannel");
            contract = network.getContract("mango-scm");
            chainCodeContract = contract;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return contract;
    }

}
