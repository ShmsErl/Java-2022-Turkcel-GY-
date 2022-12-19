package LayerDemo.Business.Abstract;

import java.util.List;

import LayerDemo.Entities.Concretes.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);

	void update(Campaign campaign, int id);

	void delete(int id);

	List<Campaign> get();
}
