public class A1Q4 {

	public static void main(String[] args) {
		String s = "CARBON";
		String st =" ";
		int l = s.length();
		for(int i1=0;i1<l;i1++) {
			for(int i2=0;i2<l;i2++) {
				for(int i3=0;i3<l;i3++) {
					for(int i4=0;i4<l;i4++) {
						for(int i5=0;i5<l;i5++) {
							for(int i6=0;i6<l;i6++) {
								if((s.charAt(i1)!=s.charAt(i2))&&(s.charAt(i1)!=s.charAt(i3))&&(s.charAt(i1)!=s.charAt(i4))&&(s.charAt(i1)!=s.charAt(i5))&&(s.charAt(i1)!=s.charAt(i6))) {
									if((s.charAt(i2)!=s.charAt(i3))&&(s.charAt(i2)!=s.charAt(i4))&&(s.charAt(i2)!=s.charAt(i5))&&(s.charAt(i2)!=s.charAt(i6))){
										if((s.charAt(i3)!=s.charAt(i4))&&(s.charAt(i3)!=s.charAt(i5))&&(s.charAt(i3)!=s.charAt(i6))){
											if((s.charAt(i4)!=s.charAt(i5))&&(s.charAt(i4)!=s.charAt(i6))) {
												if((s.charAt(i4)!=s.charAt(i6))) {
													 st = "  "+ s.charAt(i1) +  s.charAt(i2) +  s.charAt(i3) +  s.charAt(i4) +  s.charAt(i5) +  s.charAt(i6);												}
												    System.out.println(st);
											}
										}
									}
								}

							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
			

	}

}
