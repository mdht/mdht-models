/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.SeriesActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	public SOPInstanceObservation getSOPInstanceObservation() {
		return SeriesActOperations.getSOPInstanceObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} // SeriesActImpl
