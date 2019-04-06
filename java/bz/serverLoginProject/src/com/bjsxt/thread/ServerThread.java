package com.bjsxt.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import com.bjsxt.entity.User;

public class ServerThread implements Runnable{
	private Socket socket;//��Ա����
	public ServerThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"�����¼");
		//(2)��ȡ������--����������
		ObjectInputStream ois=null;
		//(4)��ȡ�����(������)
		DataOutputStream dos=null;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			User user=(User) ois.readObject();
			
			System.out.println(socket.getInetAddress().getHostAddress()+"�����¼:�û���"+user.getUserName()+"\t����:"+user.getPassword());
			String str="";
			//(3)���û��������������֤
			if("bjsxt".equals(user.getUserName())&&"bjsxt".equals(user.getPassword())){
				str="��¼�ɹ�";
			}else{
				str="�Բ����˺ź����벻��ȷ";
			}
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(str);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				//(5)�ر���
				if(dos!=null){
					try {
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(ois!=null){
					try {
						ois.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(socket!=null){
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		
	}

}
