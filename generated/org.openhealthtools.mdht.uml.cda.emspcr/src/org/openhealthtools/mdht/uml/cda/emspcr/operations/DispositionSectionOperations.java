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

import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionNumberOfPatientsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionIncidentDispositionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTransportModeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionTransportMethodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionReasonForChoosingDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionPrearrivalActivationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#validateDispositionSectionPatientConditionChangeAtDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getemspcrEntry4() <em>Getemspcr Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getNumberOfPatientsObservation() <em>Get Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getIncidentDispositionObservation() <em>Get Incident Disposition Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getTransportModeObservation() <em>Get Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getTransportMethodObservation() <em>Get Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getReasonForChoosingDestinationObservation() <em>Get Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getPrearrivalActivationObservation() <em>Get Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection#getPatientConditionChangeAtDestinationObservation() <em>Get Patient Condition Change At Destination Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispositionSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispositionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionTemplateId(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTemplateId(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionTemplateId(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTemplateId(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionTemplateId(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionTemplateId"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionCode(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionCode(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionCode(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionCode(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionCode(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionCode"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionCodeP(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionCodeP(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionCodeP(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionCodeP(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionCodeP(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionCodeP"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionTitle(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTitle(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Disposition')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionTitle(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTitle(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionTitle(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionTitle"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionText(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionText(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionText(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionText(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionText(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionText"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionEntry4(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Entry4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionEntry4(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportMethodObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionEntry4(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Entry4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionEntry4(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionEntry4(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_ENTRY4,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionEntry4"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionNumberOfPatientsObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionNumberOfPatientsObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::NumberOfPatientsObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionNumberOfPatientsObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Number Of Patients Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionNumberOfPatientsObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionNumberOfPatientsObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionNumberOfPatientsObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionIncidentDispositionObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Incident Disposition Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionIncidentDispositionObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::IncidentDispositionObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionIncidentDispositionObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Incident Disposition Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionIncidentDispositionObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionIncidentDispositionObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_INCIDENT_DISPOSITION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionIncidentDispositionObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionTransportModeObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTransportModeObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportModeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionTransportModeObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Mode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTransportModeObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionTransportModeObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionTransportModeObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionTransportMethodObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTransportMethodObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportMethodObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionTransportMethodObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Transport Method Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionTransportMethodObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionTransportMethodObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionTransportMethodObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionReasonForChoosingDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionReasonForChoosingDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionReasonForChoosingDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Reason For Choosing Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionReasonForChoosingDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionReasonForChoosingDestinationObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionReasonForChoosingDestinationObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionPrearrivalActivationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Prearrival Activation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionPrearrivalActivationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrearrivalActivationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionPrearrivalActivationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Prearrival Activation Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionPrearrivalActivationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionPrearrivalActivationObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionPrearrivalActivationObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispositionSectionPatientConditionChangeAtDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionPatientConditionChangeAtDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientConditionChangeAtDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateDispositionSectionPatientConditionChangeAtDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disposition Section Patient Condition Change At Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispositionSectionPatientConditionChangeAtDestinationObservation(DispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispositionSection The receiving '<em><b>Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispositionSectionPatientConditionChangeAtDestinationObservation(DispositionSection dispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPOSITION_SECTION);
			try {
				VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPOSITION_SECTION__DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("DispositionSectionPatientConditionChangeAtDestinationObservation"),
						 new Object [] { dispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getemspcrEntry4(DispositionSection) <em>Getemspcr Entry4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getemspcrEntry4(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETEMSPCR_ENTRY4__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportMethodObservation))->asSequence()->any(true).oclAsType(emspcr::TransportMethodObservation)";

	/**
	 * The cached OCL query for the '{@link #getemspcrEntry4(DispositionSection) <em>Getemspcr Entry4</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getemspcrEntry4(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETEMSPCR_ENTRY4__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportMethodObservation getemspcrEntry4(DispositionSection dispositionSection) {
		if (GETEMSPCR_ENTRY4__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(68));
			try {
				GETEMSPCR_ENTRY4__EOCL_QRY = helper.createQuery(GETEMSPCR_ENTRY4__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETEMSPCR_ENTRY4__EOCL_QRY);
		return (TransportMethodObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPatientsObservation(DispositionSection) <em>Get Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::NumberOfPatientsObservation))->asSequence()->any(true).oclAsType(emspcr::NumberOfPatientsObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPatientsObservation(DispositionSection) <em>Get Number Of Patients Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NumberOfPatientsObservation getNumberOfPatientsObservation(DispositionSection dispositionSection) {
		if (GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(69));
			try {
				GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY);
		return (NumberOfPatientsObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIncidentDispositionObservation(DispositionSection) <em>Get Incident Disposition Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentDispositionObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::IncidentDispositionObservation))->asSequence()->any(true).oclAsType(emspcr::IncidentDispositionObservation)";

	/**
	 * The cached OCL query for the '{@link #getIncidentDispositionObservation(DispositionSection) <em>Get Incident Disposition Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentDispositionObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  IncidentDispositionObservation getIncidentDispositionObservation(DispositionSection dispositionSection) {
		if (GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(70));
			try {
				GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INCIDENT_DISPOSITION_OBSERVATION__EOCL_QRY);
		return (IncidentDispositionObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportModeObservation(DispositionSection) <em>Get Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportModeObservation))->asSequence()->any(true).oclAsType(emspcr::TransportModeObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportModeObservation(DispositionSection) <em>Get Transport Mode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportModeObservation getTransportModeObservation(DispositionSection dispositionSection) {
		if (GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(71));
			try {
				GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY);
		return (TransportModeObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportMethodObservation(DispositionSection) <em>Get Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportMethodObservation))->asSequence()->any(true).oclAsType(emspcr::TransportMethodObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportMethodObservation(DispositionSection) <em>Get Transport Method Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportMethodObservation getTransportMethodObservation(DispositionSection dispositionSection) {
		if (GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(72));
			try {
				GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY);
		return (TransportMethodObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForChoosingDestinationObservation(DispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::ReasonForChoosingDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getReasonForChoosingDestinationObservation(DispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation(DispositionSection dispositionSection) {
		if (GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(73));
			try {
				GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY);
		return (ReasonForChoosingDestinationObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrearrivalActivationObservation(DispositionSection) <em>Get Prearrival Activation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrearrivalActivationObservation))->asSequence()->any(true).oclAsType(emspcr::PrearrivalActivationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPrearrivalActivationObservation(DispositionSection) <em>Get Prearrival Activation Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PrearrivalActivationObservation getPrearrivalActivationObservation(DispositionSection dispositionSection) {
		if (GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(74));
			try {
				GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATION__EOCL_QRY);
		return (PrearrivalActivationObservation) query.evaluate(dispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientConditionChangeAtDestinationObservation(DispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientConditionChangeAtDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::PatientConditionChangeAtDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPatientConditionChangeAtDestinationObservation(DispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(DispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientConditionChangeAtDestinationObservation getPatientConditionChangeAtDestinationObservation(DispositionSection dispositionSection) {
		if (GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.DISPOSITION_SECTION, EmspcrPackage.Literals.DISPOSITION_SECTION.getEAllOperations().get(75));
			try {
				GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY);
		return (PatientConditionChangeAtDestinationObservation) query.evaluate(dispositionSection);
	}

} // DispositionSectionOperations