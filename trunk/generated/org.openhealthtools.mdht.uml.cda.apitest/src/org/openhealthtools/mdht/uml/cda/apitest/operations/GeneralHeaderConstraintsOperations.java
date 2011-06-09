/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.apitest.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getTypeId() <em>Get Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getId() <em>Get Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCode() <em>Get Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getTitle() <em>Get Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getEffectiveTime() <em>Get Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getConfidentialityCode() <em>Get Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getLanguageCode() <em>Get Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getSetId() <em>Get Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getRecordTargets() <em>Get Record Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#addRecordTarget(org.openhealthtools.mdht.uml.cda.RecordTarget) <em>Add Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getAuthors() <em>Get Authors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#addAuthor(org.openhealthtools.mdht.uml.cda.Author) <em>Add Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCustodian() <em>Get Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getComponent() <em>Get Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #toCDAType(GeneralHeaderConstraints) <em>To CDA Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #toCDAType(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String TO_CDA_TYPE__EOCL_EXP = "self.oclAsType(cda::ClinicalDocument)";

	/**
	 * The cached OCL query for the '{@link #toCDAType(GeneralHeaderConstraints) <em>To CDA Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #toCDAType(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TO_CDA_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.oclAsType(cda::ClinicalDocument)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ClinicalDocument toCDAType(GeneralHeaderConstraints generalHeaderConstraints) {
		if (TO_CDA_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(0));
			try {
				TO_CDA_TYPE__EOCL_QRY = helper.createQuery(TO_CDA_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TO_CDA_TYPE__EOCL_QRY);
		return (ClinicalDocument) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTypeId(GeneralHeaderConstraints) <em>Get Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TYPE_ID__EOCL_EXP = "self.typeId.oclAsType(cda::InfrastructureRootTypeId)";

	/**
	 * The cached OCL query for the '{@link #getTypeId(GeneralHeaderConstraints) <em>Get Type Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TYPE_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::typeId.
	 * self.typeId.oclAsType(cda::InfrastructureRootTypeId)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static InfrastructureRootTypeId getTypeId(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_TYPE_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(1));
			try {
				GET_TYPE_ID__EOCL_QRY = helper.createQuery(GET_TYPE_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TYPE_ID__EOCL_QRY);
		return (InfrastructureRootTypeId) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getId(GeneralHeaderConstraints) <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ID__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getId(GeneralHeaderConstraints) <em>Get Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::id.
	 * self.id.oclAsType(datatypes::II)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static II getId(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(4));
			try {
				GET_ID__EOCL_QRY = helper.createQuery(GET_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ID__EOCL_QRY);
		return (II) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode(GeneralHeaderConstraints) <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getCode(GeneralHeaderConstraints) <em>Get Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::code.
	 * self.code.oclAsType(datatypes::CE)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CE getCode(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(7));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CE) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::languageCode.
	 * self.languageCode.oclAsType(datatypes::CS)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CS getLanguageCode(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_LANGUAGE_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(19));
			try {
				GET_LANGUAGE_CODE__EOCL_QRY = helper.createQuery(GET_LANGUAGE_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LANGUAGE_CODE__EOCL_QRY);
		return (CS) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::setId.
	 * self.setId.oclAsType(datatypes::II)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static II getSetId(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_SET_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(22));
			try {
				GET_SET_ID__EOCL_QRY = helper.createQuery(GET_SET_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SET_ID__EOCL_QRY);
		return (II) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::recordTarget.
	 * self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<RecordTarget> getRecordTargets(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_RECORD_TARGETS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(25));
			try {
				GET_RECORD_TARGETS__EOCL_QRY = helper.createQuery(GET_RECORD_TARGETS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECORD_TARGETS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RecordTarget> result = (Collection<RecordTarget>) query.evaluate(generalHeaderConstraints);
		return new BasicEList.UnmodifiableEList<RecordTarget>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static IGeneralHeaderConstraints addRecordTarget(GeneralHeaderConstraints generalHeaderConstraints,
			RecordTarget value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::author.
	 * self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Author> getAuthors(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_AUTHORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(28));
			try {
				GET_AUTHORS__EOCL_QRY = helper.createQuery(GET_AUTHORS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Author> result = (Collection<Author>) query.evaluate(generalHeaderConstraints);
		return new BasicEList.UnmodifiableEList<Author>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] author, where its type is Author.
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static IGeneralHeaderConstraints addAuthor(GeneralHeaderConstraints generalHeaderConstraints, Author value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::custodian.
	 * self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Custodian getCustodian(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_CUSTODIAN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(31));
			try {
				GET_CUSTODIAN__EOCL_QRY = helper.createQuery(GET_CUSTODIAN__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CUSTODIAN__EOCL_QRY);
		return (Custodian) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::component.
	 * self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Component2 getComponent(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(34));
			try {
				GET_COMPONENT__EOCL_QRY = helper.createQuery(GET_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPONENT__EOCL_QRY);
		return (Component2) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTitle(GeneralHeaderConstraints) <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TITLE__EOCL_EXP = "self.title.oclAsType(datatypes::ST)";

	/**
	 * The cached OCL query for the '{@link #getTitle(GeneralHeaderConstraints) <em>Get Title</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TITLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::title.
	 * self.title.oclAsType(datatypes::ST)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ST getTitle(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_TITLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(10));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TITLE__EOCL_QRY);
		return (ST) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEffectiveTime(GeneralHeaderConstraints) <em>Get Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::TS)";

	/**
	 * The cached OCL query for the '{@link #getEffectiveTime(GeneralHeaderConstraints) <em>Get Effective Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EFFECTIVE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::TS)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static TS getEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(13));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (TS) query.evaluate(generalHeaderConstraints);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCode(GeneralHeaderConstraints) <em>Get Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE__EOCL_EXP = "self.confidentialityCode.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCode(GeneralHeaderConstraints) <em>Get Confidentiality Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getLanguageCode(GeneralHeaderConstraints) <em>Get Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LANGUAGE_CODE__EOCL_EXP = "self.languageCode.oclAsType(datatypes::CS)";

	/**
	 * The cached OCL query for the '{@link #getLanguageCode(GeneralHeaderConstraints) <em>Get Language Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LANGUAGE_CODE__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getSetId(GeneralHeaderConstraints) <em>Get Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SET_ID__EOCL_EXP = "self.setId.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getSetId(GeneralHeaderConstraints) <em>Get Set Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetId(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SET_ID__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getRecordTargets(GeneralHeaderConstraints) <em>Get Record Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECORD_TARGETS__EOCL_EXP = "self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)";

	/**
	 * The cached OCL query for the '{@link #getRecordTargets(GeneralHeaderConstraints) <em>Get Record Targets</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECORD_TARGETS__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getAuthors(GeneralHeaderConstraints) <em>Get Authors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHORS__EOCL_EXP = "self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)";

	/**
	 * The cached OCL query for the '{@link #getAuthors(GeneralHeaderConstraints) <em>Get Authors</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHORS__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getCustodian(GeneralHeaderConstraints) <em>Get Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CUSTODIAN__EOCL_EXP = "self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)";

	/**
	 * The cached OCL query for the '{@link #getCustodian(GeneralHeaderConstraints) <em>Get Custodian</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CUSTODIAN__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getComponent(GeneralHeaderConstraints) <em>Get Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPONENT__EOCL_EXP = "self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)";

	/**
	 * The cached OCL query for the '{@link #getComponent(GeneralHeaderConstraints) <em>Get Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::confidentialityCode.
	 * self.confidentialityCode.oclAsType(datatypes::CE)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CE getConfidentialityCode(GeneralHeaderConstraints generalHeaderConstraints) {
		if (GET_CONFIDENTIALITY_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS,
				DomainPackage.Literals.IGENERAL_HEADER_CONSTRAINTS.getEAllOperations().get(16));
			try {
				GET_CONFIDENTIALITY_CODE__EOCL_QRY = helper.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_QRY);
		return (CE) query.evaluate(generalHeaderConstraints);
	}

} // GeneralHeaderConstraintsOperations
