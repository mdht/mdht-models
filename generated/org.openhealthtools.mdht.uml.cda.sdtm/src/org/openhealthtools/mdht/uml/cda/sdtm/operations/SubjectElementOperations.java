/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

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
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateHumanClinicalExposureelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateHumanClinicalExposureelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectElementOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectElementOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.93')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementTemplateId(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementClassCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementMoodCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementId(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementCodeP(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementEffectiveTime(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyEpoch) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementStudyEpoch(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_STUDY_EPOCH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementElementOrderAssociation(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementElementOrderAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementComment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementComment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementComment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementComment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementComment(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementDomainAssignment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementDomainAssignment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementDomainAssignment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementDomainAssignment(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementDomainAssignment(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementRelatedRecord(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementRelatedRecord(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementRelatedRecord(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementRelatedRecord(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementRelatedRecord(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementSupplementalValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementSupplementalValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementSupplementalValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementSupplementalValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementSupplementalValue(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementFindingAbout(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementFindingAbout(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementFindingAbout(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementFindingAbout(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementFindingAbout(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Element Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Association Element Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('classCode')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Human Clinical Exposureelement Order Associationelement Order Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
			try {
				VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(subjectElement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
						 new Object [] { subjectElement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyEpoch(SubjectElement) <em>Get Study Epoch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEpoch(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyEpoch))->asSequence()->any(true).oclAsType(sdtm::StudyEpoch)";

	/**
	 * The cached OCL query for the '{@link #getStudyEpoch(SubjectElement) <em>Get Study Epoch</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEpoch(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyEpoch getStudyEpoch(SubjectElement subjectElement) {
	
	
	
		if (GET_STUDY_EPOCH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(77));
			try {
				GET_STUDY_EPOCH__EOCL_QRY = helper.createQuery(GET_STUDY_EPOCH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STUDY_EPOCH__EOCL_QRY);
		return (StudyEpoch) query.evaluate(subjectElement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(SubjectElement) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(SubjectElement) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(SubjectElement subjectElement) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(78));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(subjectElement);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(SubjectElement) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(SubjectElement) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(SubjectElement subjectElement) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(79));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(subjectElement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(SubjectElement) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(SubjectElement) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(SubjectElement subjectElement) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(80));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(subjectElement);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(SubjectElement) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(SubjectElement) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(SubjectElement subjectElement) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(81));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(subjectElement);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(SubjectElement) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(SubjectElement) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(SubjectElement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(SubjectElement subjectElement) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(82));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(subjectElement);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // SubjectElementOperations