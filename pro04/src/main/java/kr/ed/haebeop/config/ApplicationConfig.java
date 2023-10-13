package kr.ed.haebeop.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ed.haebeop.persistence.*;
import kr.ed.haebeop.repository.NoticeRepository;
import kr.ed.haebeop.repository.NoticeRepositoryImpl;
import kr.ed.haebeop.service.*;
import kr.ed.haebeop.util.Utils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.ed.haebeop"})
public class ApplicationConfig {

    //Notice
    @Bean
    public NoticeRepository noticeRepository(){
        return new NoticeRepositoryImpl();
    }

    @Bean
    public NoticeService noticeService(){
        return new NoticeServiceImpl();
    }

    //utils
    @Bean
    public Utils utils() {return new Utils();}

    @Bean
    public ObjectMapper mapper() { return new ObjectMapper(); }
}
