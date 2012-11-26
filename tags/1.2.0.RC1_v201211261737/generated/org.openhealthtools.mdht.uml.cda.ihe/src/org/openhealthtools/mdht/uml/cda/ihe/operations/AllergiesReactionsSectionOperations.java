/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertsSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#validateAllergiesReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#validateAllergiesReactionsSectionAllergyIntoleranceConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Allergy Intolerance Concern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#getAllergyIntoleranceConcerns() <em>Get Allergy Intolerance Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesReactionsSectionOperations extends AlertsSectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AllergiesReactionsSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.13')";

	/**
	* The cached OCL invariant for the '{@link #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param allergiesReactionsSection The receiving '<em><b>Allergies Reactions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAllergiesReactionsSectionTemplateId(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("AllergiesReactionsSectionTemplateId"),
					new Object[] { allergiesReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAllergiesReactionsSectionAllergyIntoleranceConcern(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Allergy Intolerance Concern</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAllergiesReactionsSectionAllergyIntoleranceConcern(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::AllergyIntoleranceConcern))";

	/**
	* The cached OCL invariant for the '{@link #validateAllergiesReactionsSectionAllergyIntoleranceConcern(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Allergy Intolerance Concern</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAllergiesReactionsSectionAllergyIntoleranceConcern(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param allergiesReactionsSection The receiving '<em><b>Allergies Reactions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAllergiesReactionsSectionAllergyIntoleranceConcern(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergiesReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN,
					IHEPlugin.INSTANCE.getString("AllergiesReactionsSectionAllergyIntoleranceConcern"),
					new Object[] { allergiesReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getAllergyIntoleranceConcerns(AllergiesReactionsSection) <em>Get Allergy Intolerance Concerns</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergyIntoleranceConcerns(AllergiesReactionsSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::AllergyIntoleranceConcern)).oclAsType(ihe::AllergyIntoleranceConcern)";

	/**
	* The cached OCL query for the '{@link #getAllergyIntoleranceConcerns(AllergiesReactionsSection) <em>Get Allergy Intolerance Concerns</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergyIntoleranceConcerns(AllergiesReactionsSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<AllergyIntoleranceConcern> getAllergyIntoleranceConcerns(
			AllergiesReactionsSection allergiesReactionsSection) {
		if (GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION,
				IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION.getEAllOperations().get(63));
			try {
				GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_QRY = helper.createQuery(GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_INTOLERANCE_CONCERNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyIntoleranceConcern> result = (Collection<AllergyIntoleranceConcern>) query.evaluate(allergiesReactionsSection);
		return new BasicEList.UnmodifiableEList<AllergyIntoleranceConcern>(result.size(), result.toArray());
	}

} // AllergiesReactionsSectionOperations
