/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historyof Infection Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryofInfectionSectionImpl extends SectionImpl implements HistoryofInfectionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryofInfectionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryofInfectionSectionInfectionsPresent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryofInfectionSectionOperations.validateHistoryofInfectionSectionInfectionsPresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfectionPresent> getInfectionsPresents() {
		return HistoryofInfectionSectionOperations.getInfectionsPresents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryofInfectionSectionImpl
