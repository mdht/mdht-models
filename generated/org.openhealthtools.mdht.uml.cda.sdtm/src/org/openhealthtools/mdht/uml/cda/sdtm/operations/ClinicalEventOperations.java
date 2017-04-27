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
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventStartRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventStopRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getStartRelativetoReferencePeriod() <em>Get Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getStopRelativetoReferencePeriod() <em>Get Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalEventOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ClinicalEventOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventTemplateId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventTemplateId(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventClassCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventClassCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventMoodCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventMoodCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventCodeP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCodeP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventCodeP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCodeP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventCodeP(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'CEtbd')";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventCodeVS(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCodeVS(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystemName = 'MedDRA' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventCodeVS(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCodeVS(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventCodeVS(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CODE_VS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventCodeVS", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventEffectiveTime(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventEffectiveTime(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventId(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventId(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStatusCode(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventStatusCode(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystemName = 'MedDRA' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventValue(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventValueP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventValueP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventValueP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventValueP(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventValueP(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PreSpecifiedEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventPreSpecifiedEvent(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventPreSpecifiedEvent(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_PRE_SPECIFIED_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventNonPerformanceReason(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventNonPerformanceReason(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventBodySystemorOrganClass(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventBodySystemorOrganClass(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventDataCollection(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventDataCollection(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventorFindingSeverity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventEventSeverity(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventEventSeverity(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_EVENT_SEVERITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventComment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventComment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventComment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventComment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventComment(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventDomainAssignment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventDomainAssignment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventDomainAssignment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventDomainAssignment(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventDomainAssignment(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventRelatedRecord(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventRelatedRecord(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventRelatedRecord(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventRelatedRecord(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventRelatedRecord(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventSupplementalValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventSupplementalValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventSupplementalValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventSupplementalValue(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventSupplementalValue(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventStartRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStartRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventStartRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Start Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStartRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventStartRelativetoReferencePeriod(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_START_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventStartRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventStopRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStopRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventStopRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Stop Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventStopRelativetoReferencePeriod(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventStopRelativetoReferencePeriod(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_STOP_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventStopRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventCategory(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCategory(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventCategory(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventCategory(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventCategory(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalEventFindingAbout(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventFindingAbout(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalEventFindingAbout(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalEventFindingAbout(ClinicalEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalEvent The receiving '<em><b>Clinical Event</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateClinicalEventFindingAbout(ClinicalEvent clinicalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CLINICAL_EVENT);
			try {
				VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLINICAL_EVENT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(clinicalEvent)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CLINICAL_EVENT__CLINICAL_EVENT_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalEventClinicalEventFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalEvent, context) }),
						 new Object [] { clinicalEvent }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(ClinicalEvent) <em>Get Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PreSpecifiedEvent))->asSequence()->any(true).oclAsType(sdtm::PreSpecifiedEvent)";

	/**
	 * The cached OCL query for the '{@link #getPreSpecifiedEvent(ClinicalEvent) <em>Get Pre Specified Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PreSpecifiedEvent getPreSpecifiedEvent(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(75));
			try {
				GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
		return (PreSpecifiedEvent) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(ClinicalEvent) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(ClinicalEvent) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(76));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(ClinicalEvent) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(ClinicalEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(77));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(ClinicalEvent) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(ClinicalEvent) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(78));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventSeverity(ClinicalEvent) <em>Get Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventorFindingSeverity))->asSequence()->any(true).oclAsType(sdtm::EventorFindingSeverity)";

	/**
	 * The cached OCL query for the '{@link #getEventSeverity(ClinicalEvent) <em>Get Event Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventorFindingSeverity getEventSeverity(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_EVENT_SEVERITY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(79));
			try {
				GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
		return (EventorFindingSeverity) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ClinicalEvent) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(ClinicalEvent) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(80));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(clinicalEvent);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(ClinicalEvent) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(ClinicalEvent) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(81));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(ClinicalEvent) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(ClinicalEvent) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(82));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(clinicalEvent);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(ClinicalEvent) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(ClinicalEvent) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(83));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(clinicalEvent);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStartRelativetoReferencePeriod(ClinicalEvent) <em>Get Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StartRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStartRelativetoReferencePeriod(ClinicalEvent) <em>Get Start Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StartRelativetoReferencePeriod getStartRelativetoReferencePeriod(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(84));
			try {
				GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StartRelativetoReferencePeriod) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStopRelativetoReferencePeriod(ClinicalEvent) <em>Get Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StopRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStopRelativetoReferencePeriod(ClinicalEvent) <em>Get Stop Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StopRelativetoReferencePeriod getStopRelativetoReferencePeriod(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(85));
			try {
				GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StopRelativetoReferencePeriod) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(ClinicalEvent) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(ClinicalEvent) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(86));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(ClinicalEvent) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(ClinicalEvent) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(87));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(clinicalEvent);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(ClinicalEvent) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(ClinicalEvent) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(ClinicalEvent)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(ClinicalEvent clinicalEvent) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.CLINICAL_EVENT, SdtmPackage.Literals.CLINICAL_EVENT.getEAllOperations().get(88));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(clinicalEvent);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // ClinicalEventOperations