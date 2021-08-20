package lab6;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType((int) (Math.random() + 1))
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);

        }
    }
}