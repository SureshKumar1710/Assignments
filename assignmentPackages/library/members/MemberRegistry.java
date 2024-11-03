package library.members;

import java.util.*;

public class MemberRegistry 
{
    private List<Member> members;

    public MemberRegistry() 
    {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member) 
    {
        members.add(member);
    }

    public void displayMembers() 
    {
        for (Member member : members) 
        {
            System.out.println("Name: " + member.getName() + ", Member ID: " + member.getMemberId());
        }
    }
    
    public Member findMemberById(String memberId) 
    {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null; 
    }
}
