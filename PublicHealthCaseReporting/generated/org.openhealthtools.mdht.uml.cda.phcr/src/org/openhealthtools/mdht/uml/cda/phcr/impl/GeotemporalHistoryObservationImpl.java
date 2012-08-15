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
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.GeotemporalHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geotemporal History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeotemporalHistoryObservationImpl extends ObservationImpl implements GeotemporalHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeotemporalHistoryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.GEOTEMPORAL_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeotemporalHistoryObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeotemporalHistoryObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
	
	
} //GeotemporalHistoryObservationImpl
