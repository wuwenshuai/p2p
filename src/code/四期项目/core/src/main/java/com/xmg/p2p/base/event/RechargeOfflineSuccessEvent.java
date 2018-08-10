package com.xmg.p2p.base.event;

import lombok.Getter;

import org.springframework.context.ApplicationEvent;

import com.xmg.p2p.business.domain.RechargeOffline;

@Getter
public class RechargeOfflineSuccessEvent extends ApplicationEvent {

	private RechargeOffline ro;

	public RechargeOfflineSuccessEvent(Object source, RechargeOffline ro) {
		super(source);
		this.ro = ro;
	}

}
