package cn.gaoyadeqs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.gaoyadeqs.domain.Book;

public interface BookMapper {
	/**
	 * ͨ��ID��ѯ����ͼ��
	 * 
	 * @param id
	 * @return
	 */

	Book queryById(long id);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @param offset ��ѯ��ʼλ��
	 * @param limit ��ѯ����
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * ���ٹݲ�����
	 * 
	 * @param bookId
	 * @return ���Ӱ����������>1����ʾ���µļ�¼����
	 */
	int reduceNumber(long bookId);

}
