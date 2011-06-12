/**
 * Copyright (C) 2010 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.csipsimple.wizards.impl;

import com.csipsimple.api.SipConfigManager;
import com.csipsimple.api.SipProfile;
import com.csipsimple.utils.PreferencesWrapper;

public class SipWise extends AlternateServerImplementation {
	
	
	@Override
	protected String getDefaultName() {
		return "Sipwise";
	}
	
	
	public SipProfile buildAccount(SipProfile account) {
		account = super.buildAccount(account);
		account.transport = SipProfile.TRANSPORT_UDP;
		account.allow_contact_rewrite = false;
		return account;
	}
	

	@Override
	public void setDefaultParams(PreferencesWrapper prefs) {
		super.setDefaultParams(prefs);
		prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_DNS_SRV, true);
		prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_ICE, false);
		prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_TURN, false);
		prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_STUN, false);
	}

	@Override
	public boolean needRestart() {
		return true;
	}
}
