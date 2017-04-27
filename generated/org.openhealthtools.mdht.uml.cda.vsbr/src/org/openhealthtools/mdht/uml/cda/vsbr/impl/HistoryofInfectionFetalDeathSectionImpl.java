/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionFetalDeathSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historyof Infection Fetal Death Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HistoryofInfectionFetalDeathSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements HistoryofInfectionFetalDeathSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryofInfectionFetalDeathSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionFetalDeathSectionOperations.validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfectionPresentFetalDeath> getInfectionPresentFetalDeaths() {
		return HistoryofInfectionFetalDeathSectionOperations.getInfectionPresentFetalDeaths(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionFetalDeathSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionFetalDeathSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryofInfectionFetalDeathSectionImpl
