package sary.hei.api.mail;

import jakarta.mail.internet.InternetAddress;
import java.io.File;
import java.util.List;
import sary.hei.api.PojaGenerated;

@PojaGenerated
public record Email(
    InternetAddress to,
    List<InternetAddress> cc,
    List<InternetAddress> bcc,
    String subject,
    String htmlBody,
    List<File> attachments) {}
