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
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.operations.IndicationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IndicationImpl extends ObservationImpl implements Indication {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected IndicationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INDICATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationCodeNullFlavor(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIndicationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationValueP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public Indication init() {
		CDAUtil.init(this);
		return this;
	}
} // IndicationImpl
