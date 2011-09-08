/**
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

package org.pjsip.pjsua;

public enum pjsua_call_media_status {
  PJSUA_CALL_MEDIA_NONE,
  PJSUA_CALL_MEDIA_ACTIVE,
  PJSUA_CALL_MEDIA_LOCAL_HOLD,
  PJSUA_CALL_MEDIA_REMOTE_HOLD,
  PJSUA_CALL_MEDIA_ERROR;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsua_call_media_status swigToEnum(int swigValue) {
    pjsua_call_media_status[] swigValues = pjsua_call_media_status.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsua_call_media_status swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsua_call_media_status.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsua_call_media_status() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsua_call_media_status(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsua_call_media_status(pjsua_call_media_status swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
