package startsftp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import org.apache.sshd.server.SshServer;
import org.apache.sshd.client.SshClient;
import org.apache.sshd.client.channel.ClientChannel;
import org.apache.sshd.client.channel.ClientChannelEvent;
import org.apache.sshd.client.session.ClientSession;
import org.apache.sshd.common.channel.Channel;
import org.apache.sshd.server.auth.password.PasswordAuthenticator;
import org.apache.sshd.server.session.ServerSession;
import org.apache.sshd.server.auth.password.PasswordAuthenticator;

public class MyPasswordAuthenticator implements PasswordAuthenticator {

public boolean authenticate(String username, String password, ServerSession session) {
    boolean retour = false;

    if ("user".equals(username) && "123".equals(password)) {
        retour = true;
    }

    return retour;
}
}
