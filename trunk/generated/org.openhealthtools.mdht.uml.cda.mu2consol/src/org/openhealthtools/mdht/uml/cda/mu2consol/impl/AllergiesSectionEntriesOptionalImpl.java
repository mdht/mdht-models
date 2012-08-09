/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AllergiesSectionEntriesOptionalOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Allergies Section Entries Optional</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AllergiesSectionEntriesOptionalImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesSectionEntriesOptionalImpl
		implements AllergiesSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AllergiesSectionEntriesOptionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.ALLERGIES_SECTION_ENTRIES_OPTIONAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionEntriesOptionalOperations
				.validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AllergyProblemAct getmu2consolAllergyProblemAct() {
		return AllergiesSectionEntriesOptionalOperations
				.getmu2consolAllergyProblemAct(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergiesSectionEntriesOptionalImpl
