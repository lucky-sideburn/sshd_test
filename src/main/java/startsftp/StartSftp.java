package startsftp;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import org.apache.sshd.server.auth.UserAuth;
import org.apache.sshd.common.NamedFactory;
import org.apache.sshd.server.SshServer;
import org.apache.sshd.client.SshClient;
import org.apache.sshd.client.channel.ClientChannel;
import org.apache.sshd.client.channel.ClientChannelEvent;
import org.apache.sshd.client.session.ClientSession;
import org.apache.sshd.common.channel.Channel;
import org.apache.sshd.server.auth.password.PasswordAuthenticator;
import org.apache.sshd.server.session.ServerSession;
import org.apache.sshd.server.auth.password.PasswordAuthenticator;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;

public class StartSftp {
  public static void main(String[] args) {
    SshServer server = SshServer.setUpDefaultServer();
    SshServer sshd = SshServer.setUpDefaultServer();
    sshd.setPort(2222);
    sshd.setPasswordAuthenticator(new MyPasswordAuthenticator());
    sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider());

    //Aggiungere username!!
    //List<NamedFactory<UserAuth>> userAuthFactories = new ArrayList<NamedFactory<UserAuth>>();
    //userAuthFactories.add(new UserAuthNone.Factory());
    //sshd.setUserAuthFactories(userAuthFactories);

    try
    {
      sshd.start();
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
   
   // mettere una sleep o un loop infinito con sleep 
   Scanner readUserInput=new Scanner(System.in);  
   String myName=readUserInput.nextLine();  


  }
}
