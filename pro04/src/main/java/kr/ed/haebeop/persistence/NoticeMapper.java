package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Notice;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeMapper {
    @Select("select * from notice")
    public List<Notice> noticeList();

    @Select("select * from notice where no=#{no}")
    public Notice getNotice(int no);

    @Insert("insert into notice (title, content) values (#{title}, #{content})")
    @Options(useGeneratedKeys=true, keyProperty="num")
    public void noticeInsert(Notice notice);

    @Update("update notice set title=#{title}, content=#{content} where no=#{no}")
    public void noticeUpdate(Notice notice);

    @Update("update notice set rc=rc+1 where no=#{no}")
    public void countUp(int no);

    @Delete("delete from delete where no=#{no}")
    public void noticeDelete(int no);
}
