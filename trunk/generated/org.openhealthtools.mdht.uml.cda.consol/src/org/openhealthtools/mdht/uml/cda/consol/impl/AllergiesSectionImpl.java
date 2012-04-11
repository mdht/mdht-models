/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergies Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergiesSectionImpl extends AllergiesSectionEntriesOptionalImpl implements AllergiesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGIES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionAllergyProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionAllergyProblemAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyProblemAct> getConsolAllergyProblemActs() {
		return AllergiesSectionOperations.getConsolAllergyProblemActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergiesSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergiesSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSection init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergiesSectionImpl
