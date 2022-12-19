package LayerDemo.DataAccess.Abstract;

import java.util.List;

import LayerDemo.Entities.Concretes.Campaign;


public interface ICampaignDao {
	void add(Campaign campaign);

	void update(Campaign campaign, int id);

	void delete(int id);

	List<Campaign> get();

}
