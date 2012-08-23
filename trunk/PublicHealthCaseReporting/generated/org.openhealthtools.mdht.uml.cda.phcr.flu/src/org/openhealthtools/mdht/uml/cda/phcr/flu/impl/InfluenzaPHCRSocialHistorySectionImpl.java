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
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaPHCRSocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements InfluenzaPHCRSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRSocialHistorySectionOperations.validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRSocialHistorySectionOperations.validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaEmploymentStatusObservation getInfluenzaEmploymentStatusObservation() {
		return InfluenzaPHCRSocialHistorySectionOperations.getInfluenzaEmploymentStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaPossibleExposureLocationAct> getInfluenzaPossibleExposureLocationActs() {
		return InfluenzaPHCRSocialHistorySectionOperations.getInfluenzaPossibleExposureLocationActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //InfluenzaPHCRSocialHistorySectionImpl
