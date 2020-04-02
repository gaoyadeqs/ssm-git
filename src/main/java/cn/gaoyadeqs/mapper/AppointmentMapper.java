package cn.gaoyadeqs.mapper;

import org.apache.ibatis.annotations.Param;

import cn.gaoyadeqs.domain.Appointment;

public interface AppointmentMapper {

	/**
	 * ����ԤԼͼ���¼
	 * 
	 * @param bookId
	 * @param studentId
	 * @return ���������
	 */
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

	/**
	 * ͨ��������ѯԤԼͼ���¼������Я��ͼ��ʵ��
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

}
