package org.stavros.remote;

import java.util.ArrayList;
import java.util.List;

public class ChannelSelector {
	
	private List<Channel> channels;
	
	private ChannelSelector() {
		channels = new ArrayList<>();
		channels.add(new Channel("ert1", "http://webtv.ert.gr/ert1-live/"));
		channels.add(new Channel("ert2", "http://webtv.ert.gr/ert2-live/"));
		channels.add(new Channel("ert3", "http://webtv.ert.gr/ert3-live/"));
		channels.add(new Channel("mega", "http://www.megatv.com/webtv/default.asp?catid=33880&subid=20763&pubid=33005683"));
		channels.add(new Channel("ant1", "http://www.antenna.gr/webtv/live"));
		channels.add(new Channel("alpha", "http://www.alphatv.gr/webtv/live"));
		channels.add(new Channel("epsilon", "http://www.epsilontv.gr/livetv/"));
	}
	
	private final static ChannelSelector INSTANCE = new ChannelSelector();
	public final static ChannelSelector getInstance() {
		return INSTANCE;
	}
	
	public Channel byName(String name) {
		Channel ret = null;
		for (Channel channel: this.channels) {
			if (channel.getName().equals(name)) {
				ret = channel;
				break;
			}
		}
		return ret;
	}

}
