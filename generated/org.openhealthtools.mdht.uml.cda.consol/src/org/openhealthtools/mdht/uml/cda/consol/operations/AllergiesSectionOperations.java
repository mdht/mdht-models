/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#getConsolAllergyProblemActs() <em>Get Consol Allergy Problem Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesSectionOperations extends AllergiesSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionCodeP(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionCodeP(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionCodeP(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionCodeP(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionCodeP(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionCodeP"),
						 new Object [] { allergiesSection }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionCodeP", passToken);
				}
				passToken.add(allergiesSection);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionCode(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionCode(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergiesSection)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionCode"),
						 new Object [] { allergiesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionTitle(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionTitle(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionTitle"),
						 new Object [] { allergiesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionText(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionText(AllergiesSection allergiesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionText"),
						 new Object [] { allergiesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionAllergyProblemAct(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionAllergyProblemAct(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionAllergyProblemAct(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionAllergyProblemAct(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionAllergyProblemAct(AllergiesSection allergiesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_ALLERGY_PROBLEM_ACT,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionAllergyProblemAct"),
						 new Object [] { allergiesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAllergyProblemActs(AllergiesSection) <em>Get Consol Allergy Problem Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyProblemActs(AllergiesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct)).oclAsType(consol::AllergyProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getConsolAllergyProblemActs(AllergiesSection) <em>Get Consol Allergy Problem Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyProblemActs(AllergiesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AllergyProblemAct> getConsolAllergyProblemActs(AllergiesSection allergiesSection) {
		if (GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ALLERGIES_SECTION, ConsolPackage.Literals.ALLERGIES_SECTION.getEAllOperations().get(67));
			try {
				GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_QRY = helper.createQuery(GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ALLERGY_PROBLEM_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyProblemAct> result = (Collection<AllergyProblemAct>) query.evaluate(allergiesSection);
		return new BasicEList.UnmodifiableEList<AllergyProblemAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection The receiving '<em><b>Allergies Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection allergiesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGIES_SECTION__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("AllergiesSectionAllergiesSectionEntriesOptionalTemplateId"),
						 new Object [] { allergiesSection }));
			}
			 
			return false;
		}
		return true;
	}

} // AllergiesSectionOperations
