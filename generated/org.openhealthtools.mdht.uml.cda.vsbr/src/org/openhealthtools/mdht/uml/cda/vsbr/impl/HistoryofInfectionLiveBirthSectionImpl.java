/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionLiveBirthSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historyof Infection Live Birth Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HistoryofInfectionLiveBirthSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements HistoryofInfectionLiveBirthSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryofInfectionLiveBirthSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfectionPresentLiveBirth> getInfectionPresentLiveBirths() {
		return HistoryofInfectionLiveBirthSectionOperations.getInfectionPresentLiveBirths(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionLiveBirthSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionLiveBirthSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryofInfectionLiveBirthSectionImpl
