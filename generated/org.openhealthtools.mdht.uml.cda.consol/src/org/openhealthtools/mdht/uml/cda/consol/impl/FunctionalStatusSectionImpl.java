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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends SectionImpl implements FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionClinicalStatements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionClinicalStatements(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionObservationCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionValueDatatype(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionValueDatatype(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionIcfCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionIcfCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionResultStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionResultStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init() {
		CDAUtil.init(this);
		return this;
	}
} // FunctionalStatusSectionImpl
