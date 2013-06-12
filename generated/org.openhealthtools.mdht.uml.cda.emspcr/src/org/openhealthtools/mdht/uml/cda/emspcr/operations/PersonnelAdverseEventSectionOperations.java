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

import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Personnel Adverse Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionAdverseEventIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#validatePersonnelAdverseEventSectionAdverseEventTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#getAdverseEventIndicator() <em>Get Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection#getAdverseEventTypeObservation() <em>Get Adverse Event Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonnelAdverseEventSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonnelAdverseEventSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionTemplateId(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionTemplateId(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionTemplateId(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionTemplateId(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionTemplateId(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionTemplateId"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionCode(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionCode(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67658-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionCode(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionCode(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionCode(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionCode"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionCodeP(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionCodeP(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionCodeP(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionCodeP(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionCodeP(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionCodeP"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionTitle(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionTitle(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionTitle(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionTitle(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionTitle(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionTitle"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionText(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionText(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionText(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionText(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionText(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionText"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionAdverseEventIndicator(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionAdverseEventIndicator(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AdverseEventIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionAdverseEventIndicator(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionAdverseEventIndicator(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionAdverseEventIndicator(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionAdverseEventIndicator"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonnelAdverseEventSectionAdverseEventTypeObservation(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionAdverseEventTypeObservation(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AdverseEventTypeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonnelAdverseEventSectionAdverseEventTypeObservation(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personnel Adverse Event Section Adverse Event Type Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonnelAdverseEventSectionAdverseEventTypeObservation(PersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param personnelAdverseEventSection The receiving '<em><b>Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePersonnelAdverseEventSectionAdverseEventTypeObservation(PersonnelAdverseEventSection personnelAdverseEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PERSONNEL_ADVERSE_EVENT_SECTION__PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("PersonnelAdverseEventSectionAdverseEventTypeObservation"),
						 new Object [] { personnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdverseEventIndicator(PersonnelAdverseEventSection) <em>Get Adverse Event Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventIndicator(PersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVERSE_EVENT_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AdverseEventIndicator))->asSequence()->any(true).oclAsType(emspcr::AdverseEventIndicator)";

	/**
	 * The cached OCL query for the '{@link #getAdverseEventIndicator(PersonnelAdverseEventSection) <em>Get Adverse Event Indicator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventIndicator(PersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AdverseEventIndicator getAdverseEventIndicator(PersonnelAdverseEventSection personnelAdverseEventSection) {
		if (GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(62));
			try {
				GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY = helper.createQuery(GET_ADVERSE_EVENT_INDICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY);
		return (AdverseEventIndicator) query.evaluate(personnelAdverseEventSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdverseEventTypeObservation(PersonnelAdverseEventSection) <em>Get Adverse Event Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventTypeObservation(PersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AdverseEventTypeObservation))->asSequence()->any(true).oclAsType(emspcr::AdverseEventTypeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdverseEventTypeObservation(PersonnelAdverseEventSection) <em>Get Adverse Event Type Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventTypeObservation(PersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AdverseEventTypeObservation getAdverseEventTypeObservation(PersonnelAdverseEventSection personnelAdverseEventSection) {
		if (GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(63));
			try {
				GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVERSE_EVENT_TYPE_OBSERVATION__EOCL_QRY);
		return (AdverseEventTypeObservation) query.evaluate(personnelAdverseEventSection);
	}

} // PersonnelAdverseEventSectionOperations