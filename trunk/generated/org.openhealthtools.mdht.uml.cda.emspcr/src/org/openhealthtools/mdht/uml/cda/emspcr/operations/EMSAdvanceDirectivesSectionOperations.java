/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

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

import org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Advanced Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#getAdvancedDirectiveObservations() <em>Get Advanced Directive Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSAdvanceDirectivesSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSAdvanceDirectivesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionTemplateId"),
						 new Object [] { emsAdvanceDirectivesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67840-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionCode"),
						 new Object [] { emsAdvanceDirectivesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Advance Directives Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionTitle"),
						 new Object [] { emsAdvanceDirectivesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionText"),
						 new Object [] { emsAdvanceDirectivesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Advanced Directive Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AdvanceDirectiveObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Advanced Directive Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_ADVANCED_DIRECTIVE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionAdvancedDirectiveObservation"),
						 new Object [] { emsAdvanceDirectivesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvancedDirectiveObservations(EMSAdvanceDirectivesSection) <em>Get Advanced Directive Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedDirectiveObservations(EMSAdvanceDirectivesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AdvanceDirectiveObservation)).oclAsType(emspcr::AdvanceDirectiveObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdvancedDirectiveObservations(EMSAdvanceDirectivesSection) <em>Get Advanced Directive Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedDirectiveObservations(EMSAdvanceDirectivesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<AdvanceDirectiveObservation> getAdvancedDirectiveObservations(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection) {
		if (GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION, EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION.getEAllOperations().get(60));
			try {
				GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCED_DIRECTIVE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation> result = (Collection<AdvanceDirectiveObservation>) query.evaluate(emsAdvanceDirectivesSection);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation>(result.size(), result.toArray());
	}

} // EMSAdvanceDirectivesSectionOperations