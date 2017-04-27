/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.SeriesActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SeriesActImpl extends ActImpl implements SeriesAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SERIES_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActIdHasRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActIdHasRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActIdNoExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActIdNoExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActCodeQualifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActCodeQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActCodeQualifierCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActCodeQualifierCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActCodeQualifierValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActCodeQualifierValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActCodeQualifierValueCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActCodeQualifierValueCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesActSOPInstanceObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriesActOperations.validateSeriesActSOPInstanceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SOPInstanceObservation> getSOPInstanceObservations() {
		return SeriesActOperations.getSOPInstanceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SeriesActImpl
