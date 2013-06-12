/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies And Adverse Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Environmental Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getDrugAllergyProblemAct() <em>Get Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesAndAdverseReactionsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesAndAdverseReactionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionTemplateId(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionTemplateId(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionTemplateId(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionTemplateId(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionTemplateId(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionTemplateId"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionCode(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionCode(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionCode(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionCode(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionCode(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionCode"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionTitle(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionTitle(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Allergies and Adverse Reactions')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionTitle(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionTitle(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionTitle(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionTitle"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionText(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionText(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionText(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionText(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionText(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionText"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionObservation(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionObservation(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionObservation(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionObservation(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionObservation(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionObservation"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(emspcr::DrugAllergyProblemAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionDrugAllergyProblemAct"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Environmental Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::EnvironmentalAllergies) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Environmental Allergies</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(AllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesAndAdverseReactionsSection The receiving '<em><b>Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES,
						 EmspcrPlugin.INSTANCE.getString("AllergiesAndAdverseReactionsSectionEnvironmentalAllergies"),
						 new Object [] { allergiesAndAdverseReactionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservation(AllergiesAndAdverseReactionsSection) <em>Get Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getObservation(AllergiesAndAdverseReactionsSection) <em>Get Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExistenceOfDrugAllergyObservation getObservation(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection) {
		if (GET_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION, EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(62));
			try {
				GET_OBSERVATION__EOCL_QRY = helper.createQuery(GET_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION__EOCL_QRY);
		return (ExistenceOfDrugAllergyObservation) query.evaluate(allergiesAndAdverseReactionsSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection) <em>Get Drug Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(emspcr::DrugAllergyProblemAct))->asSequence()->any(true).oclAsType(emspcr::DrugAllergyProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection) <em>Get Drug Allergy Problem Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DrugAllergyProblemAct getDrugAllergyProblemAct(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection) {
		if (GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION, EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(63));
			try {
				GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY = helper.createQuery(GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY);
		return (DrugAllergyProblemAct) query.evaluate(allergiesAndAdverseReactionsSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEnvironmentalAllergies(AllergiesAndAdverseReactionsSection) <em>Get Environmental Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::EnvironmentalAllergies))->asSequence()->any(true).oclAsType(emspcr::EnvironmentalAllergies)";

	/**
	 * The cached OCL query for the '{@link #getEnvironmentalAllergies(AllergiesAndAdverseReactionsSection) <em>Get Environmental Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(AllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EnvironmentalAllergies getEnvironmentalAllergies(AllergiesAndAdverseReactionsSection allergiesAndAdverseReactionsSection) {
		if (GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION, EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(64));
			try {
				GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY = helper.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY);
		return (EnvironmentalAllergies) query.evaluate(allergiesAndAdverseReactionsSection);
	}

} // AllergiesAndAdverseReactionsSectionOperations