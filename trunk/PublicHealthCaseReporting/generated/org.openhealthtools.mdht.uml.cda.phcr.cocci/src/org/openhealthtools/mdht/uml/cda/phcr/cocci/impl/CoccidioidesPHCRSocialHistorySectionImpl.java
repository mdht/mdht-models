/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPHCRSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coccidioides PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements CoccidioidesPHCRSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoccidioidesPHCRSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocciPackage.Literals.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoccidioidesPHCRSocialHistorySectionOperations.validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoccidioidesPossibleExposureLocationAct> getCoccidioidesPossibleExposureLocationActs() {
		return CoccidioidesPHCRSocialHistorySectionOperations.getCoccidioidesPossibleExposureLocationActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoccidioidesPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoccidioidesPHCRSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //CoccidioidesPHCRSocialHistorySectionImpl
