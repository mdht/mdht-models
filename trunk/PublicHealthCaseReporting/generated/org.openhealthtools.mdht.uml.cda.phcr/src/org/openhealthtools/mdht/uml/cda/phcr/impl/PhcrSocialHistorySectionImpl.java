/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.SocialHistorySectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhcrSocialHistorySectionImpl extends SocialHistorySectionImpl implements PhcrSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionGeotemporalHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionGeotemporalHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionRaceObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionRaceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionOccupationObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionOccupationObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrSocialHistorySectionPregnancyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionPregnancyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeotemporalHistoryObservation> getGeotemporalHistoryObservations() {
		return PhcrSocialHistorySectionOperations.getGeotemporalHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MostRecentTimeArrivedInUSAObservation getMostRecentTimeArrivedInUSAObservation() {
		return PhcrSocialHistorySectionOperations.getMostRecentTimeArrivedInUSAObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RaceObservation> getRaceObservations() {
		return PhcrSocialHistorySectionOperations.getRaceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OccupationObservation> getOccupationObservations() {
		return PhcrSocialHistorySectionOperations.getOccupationObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PregnancyObservation> getPregnancyObservations() {
		return PhcrSocialHistorySectionOperations.getPregnancyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrSocialHistorySectionOperations.validateSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhcrSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
		  
} //PhcrSocialHistorySectionImpl
