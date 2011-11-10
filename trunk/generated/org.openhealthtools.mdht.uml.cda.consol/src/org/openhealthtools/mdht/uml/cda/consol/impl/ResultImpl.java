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
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends ObservationImpl implements Result {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultReferenceRangeRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultReferenceRangeRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoObservationRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultNoObservationRangeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTypeCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultTypeCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultLaboratoryResultsValueSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultLaboratoryResultsValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultValuePresence(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultValuePresence(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOperations.validateResultMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result init() {
		CDAUtil.init(this);
		return this;
	}
} // ResultImpl
